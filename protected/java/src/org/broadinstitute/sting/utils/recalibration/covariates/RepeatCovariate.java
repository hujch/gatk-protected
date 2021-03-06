/*
*  By downloading the PROGRAM you agree to the following terms of use:
*  
*  BROAD INSTITUTE - SOFTWARE LICENSE AGREEMENT - FOR ACADEMIC NON-COMMERCIAL RESEARCH PURPOSES ONLY
*  
*  This Agreement is made between the Broad Institute, Inc. with a principal address at 7 Cambridge Center, Cambridge, MA 02142 (BROAD) and the LICENSEE and is effective at the date the downloading is completed (EFFECTIVE DATE).
*  
*  WHEREAS, LICENSEE desires to license the PROGRAM, as defined hereinafter, and BROAD wishes to have this PROGRAM utilized in the public interest, subject only to the royalty-free, nonexclusive, nontransferable license rights of the United States Government pursuant to 48 CFR 52.227-14; and
*  WHEREAS, LICENSEE desires to license the PROGRAM and BROAD desires to grant a license on the following terms and conditions.
*  NOW, THEREFORE, in consideration of the promises and covenants made herein, the parties hereto agree as follows:
*  
*  1. DEFINITIONS
*  1.1 PROGRAM shall mean copyright in the object code and source code known as GATK2 and related documentation, if any, as they exist on the EFFECTIVE DATE and can be downloaded from http://www.broadinstitute/GATK on the EFFECTIVE DATE.
*  
*  2. LICENSE
*  2.1   Grant. Subject to the terms of this Agreement, BROAD hereby grants to LICENSEE, solely for academic non-commercial research purposes, a non-exclusive, non-transferable license to: (a) download, execute and display the PROGRAM and (b) create bug fixes and modify the PROGRAM. 
*  The LICENSEE may apply the PROGRAM in a pipeline to data owned by users other than the LICENSEE and provide these users the results of the PROGRAM provided LICENSEE does so for academic non-commercial purposes only.  For clarification purposes, academic sponsored research is not a commercial use under the terms of this Agreement.
*  2.2  No Sublicensing or Additional Rights. LICENSEE shall not sublicense or distribute the PROGRAM, in whole or in part, without prior written permission from BROAD.  LICENSEE shall ensure that all of its users agree to the terms of this Agreement.  LICENSEE further agrees that it shall not put the PROGRAM on a network, server, or other similar technology that may be accessed by anyone other than the LICENSEE and its employees and users who have agreed to the terms of this agreement.
*  2.3  License Limitations. Nothing in this Agreement shall be construed to confer any rights upon LICENSEE by implication, estoppel, or otherwise to any computer software, trademark, intellectual property, or patent rights of BROAD, or of any other entity, except as expressly granted herein. LICENSEE agrees that the PROGRAM, in whole or part, shall not be used for any commercial purpose, including without limitation, as the basis of a commercial software or hardware product or to provide services. LICENSEE further agrees that the PROGRAM shall not be copied or otherwise adapted in order to circumvent the need for obtaining a license for use of the PROGRAM.  
*  
*  3. OWNERSHIP OF INTELLECTUAL PROPERTY 
*  LICENSEE acknowledges that title to the PROGRAM shall remain with BROAD. The PROGRAM is marked with the following BROAD copyright notice and notice of attribution to contributors. LICENSEE shall retain such notice on all copies.  LICENSEE agrees to include appropriate attribution if any results obtained from use of the PROGRAM are included in any publication.
*  Copyright 2012 Broad Institute, Inc.
*  Notice of attribution:  The GATK2 program was made available through the generosity of Medical and Population Genetics program at the Broad Institute, Inc.
*  LICENSEE shall not use any trademark or trade name of BROAD, or any variation, adaptation, or abbreviation, of such marks or trade names, or any names of officers, faculty, students, employees, or agents of BROAD except as states above for attribution purposes.
*  
*  4. INDEMNIFICATION
*  LICENSEE shall indemnify, defend, and hold harmless BROAD, and their respective officers, faculty, students, employees, associated investigators and agents, and their respective successors, heirs and assigns, (Indemnitees), against any liability, damage, loss, or expense (including reasonable attorneys fees and expenses) incurred by or imposed upon any of the Indemnitees in connection with any claims, suits, actions, demands or judgments arising out of any theory of liability (including, without limitation, actions in the form of tort, warranty, or strict liability and regardless of whether such action has any factual basis) pursuant to any right or license granted under this Agreement.
*  
*  5. NO REPRESENTATIONS OR WARRANTIES
*  THE PROGRAM IS DELIVERED AS IS.  BROAD MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE PROGRAM OR THE COPYRIGHT, EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER OR NOT DISCOVERABLE. BROAD EXTENDS NO WARRANTIES OF ANY KIND AS TO PROGRAM CONFORMITY WITH WHATEVER USER MANUALS OR OTHER LITERATURE MAY BE ISSUED FROM TIME TO TIME.
*  IN NO EVENT SHALL BROAD OR ITS RESPECTIVE DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATED INVESTIGATORS AND AFFILIATES BE LIABLE FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND, INCLUDING, WITHOUT LIMITATION, ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER BROAD SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
*  
*  6. ASSIGNMENT
*  This Agreement is personal to LICENSEE and any rights or obligations assigned by LICENSEE without the prior written consent of BROAD shall be null and void.
*  
*  7. MISCELLANEOUS
*  7.1 Export Control. LICENSEE gives assurance that it will comply with all United States export control laws and regulations controlling the export of the PROGRAM, including, without limitation, all Export Administration Regulations of the United States Department of Commerce. Among other things, these laws and regulations prohibit, or require a license for, the export of certain types of software to specified countries.
*  7.2 Termination. LICENSEE shall have the right to terminate this Agreement for any reason upon prior written notice to BROAD. If LICENSEE breaches any provision hereunder, and fails to cure such breach within thirty (30) days, BROAD may terminate this Agreement immediately. Upon termination, LICENSEE shall provide BROAD with written assurance that the original and all copies of the PROGRAM have been destroyed, except that, upon prior written authorization from BROAD, LICENSEE may retain a copy for archive purposes.
*  7.3 Survival. The following provisions shall survive the expiration or termination of this Agreement: Articles 1, 3, 4, 5 and Sections 2.2, 2.3, 7.3, and 7.4.
*  7.4 Notice. Any notices under this Agreement shall be in writing, shall specifically refer to this Agreement, and shall be sent by hand, recognized national overnight courier, confirmed facsimile transmission, confirmed electronic mail, or registered or certified mail, postage prepaid, return receipt requested.  All notices under this Agreement shall be deemed effective upon receipt. 
*  7.5 Amendment and Waiver; Entire Agreement. This Agreement may be amended, supplemented, or otherwise modified only by means of a written instrument signed by all parties. Any waiver of any rights or failure to act in a specific instance shall relate only to such instance and shall not be construed as an agreement to waive any rights or fail to act in any other instance, whether or not similar. This Agreement constitutes the entire agreement among the parties with respect to its subject matter and supersedes prior agreements or understandings between the parties relating to its subject matter. 
*  7.6 Binding Effect; Headings. This Agreement shall be binding upon and inure to the benefit of the parties and their respective permitted successors and assigns. All headings are for convenience only and shall not affect the meaning of any provision of this Agreement.
*  7.7 Governing Law. This Agreement shall be construed, governed, interpreted and applied in accordance with the internal laws of the Commonwealth of Massachusetts, U.S.A., without regard to conflict of laws principles.
*/

package org.broadinstitute.sting.utils.recalibration.covariates;

import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;
import org.broadinstitute.sting.gatk.walkers.bqsr.RecalibrationArgumentCollection;
import org.broadinstitute.sting.utils.recalibration.ReadCovariates;
import org.broadinstitute.sting.utils.sam.GATKSAMRecord;
import org.broadinstitute.sting.utils.variant.GATKVariantContextUtils;
import org.broadinstitute.sting.utils.BaseUtils;
import org.broadinstitute.sting.utils.collections.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class RepeatCovariate implements ExperimentalCovariate {
    protected int MAX_REPEAT_LENGTH;
    protected int MAX_STR_UNIT_LENGTH;
    private final HashMap<String, Integer> repeatLookupTable = new HashMap<String, Integer>();
    private final HashMap<Integer, String> repeatReverseLookupTable = new HashMap<Integer, String>();
    private int nextId = 0;

    // Initialize any member variables using the command-line arguments passed to the walkers
    @Override
    public void initialize(final RecalibrationArgumentCollection RAC) {
        MAX_STR_UNIT_LENGTH = RAC.MAX_STR_UNIT_LENGTH;
        MAX_REPEAT_LENGTH = RAC.MAX_REPEAT_LENGTH;
    }

    @Override
    public void recordValues(final GATKSAMRecord read, final ReadCovariates values) {
        // store the original bases and then write Ns over low quality ones
        final byte[] originalBases = read.getReadBases().clone();

        final boolean negativeStrand = read.getReadNegativeStrandFlag();
        byte[] bases = read.getReadBases();
        if (negativeStrand)
            bases = BaseUtils.simpleReverseComplement(bases);

        // don't record reads with N's
        if (!BaseUtils.isAllRegularBases(bases))
            return;

        for (int i = 0; i < bases.length; i++) {
            final Pair<byte[], Integer> res = findTandemRepeatUnits(bases, i);
            // to merge repeat unit and repeat length to get covariate value:
            final String repeatID =  getCovariateValueFromUnitAndLength(res.first,  res.second);
            final int key = keyForRepeat(repeatID);

            final int readOffset = (negativeStrand ? bases.length - i - 1 : i);
            values.addCovariate(key, key, key, readOffset);
        }

        // put the original bases back in
        read.setReadBases(originalBases);

    }

    private Pair<byte[], Integer> findTandemRepeatUnits(byte[] readBases, int offset) {
        int maxBW = 0;
        byte[] bestBWRepeatUnit = new byte[]{readBases[offset]};
        for (int str = 1; str <= MAX_STR_UNIT_LENGTH; str++) {
            // fix repeat unit length
            //edge case: if candidate tandem repeat unit falls beyond edge of read, skip
            if (offset+1-str < 0)
                break;

            // get backward repeat unit and # repeats
            byte[] backwardRepeatUnit = Arrays.copyOfRange(readBases, offset - str + 1, offset + 1);
            maxBW = GATKVariantContextUtils.findNumberofRepetitions(backwardRepeatUnit, Arrays.copyOfRange(readBases, 0, offset + 1), false);
            if (maxBW > 1) {
                bestBWRepeatUnit = backwardRepeatUnit.clone();
                break;
            }
        }
        byte[] bestRepeatUnit = bestBWRepeatUnit;
        int maxRL = maxBW;

        if (offset < readBases.length-1) {
            byte[] bestFWRepeatUnit = new byte[]{readBases[offset+1]};
            int maxFW = 0;
            for (int str = 1; str <= MAX_STR_UNIT_LENGTH; str++) {
                // fix repeat unit length
                //edge case: if candidate tandem repeat unit falls beyond edge of read, skip
                if (offset+str+1 > readBases.length)
                    break;

                // get forward repeat unit and # repeats
                byte[] forwardRepeatUnit = Arrays.copyOfRange(readBases, offset +1, offset+str+1);
                maxFW = GATKVariantContextUtils.findNumberofRepetitions(forwardRepeatUnit, Arrays.copyOfRange(readBases, offset + 1, readBases.length), true);
                if (maxFW > 1) {
                    bestFWRepeatUnit = forwardRepeatUnit.clone();
                    break;
                }
            }
            // if FW repeat unit = BW repeat unit it means we're in the middle of a tandem repeat - add FW and BW components
            if (Arrays.equals(bestFWRepeatUnit, bestBWRepeatUnit)) {
                maxRL = maxBW + maxFW;
                bestRepeatUnit = bestFWRepeatUnit; // arbitrary
            }
            else {
                // tandem repeat starting forward from current offset.
                // It could be the case that best BW unit was differnet from FW unit, but that BW still contains FW unit.
                // For example, TTCTT(C) CCC - at (C) place, best BW unit is (TTC)2, best FW unit is (C)3.
                // but correct representation at that place might be (C)4.
                // Hence, if the FW and BW units don't match, check if BW unit can still be a part of FW unit and add
                // representations to total
                maxBW = GATKVariantContextUtils.findNumberofRepetitions(bestFWRepeatUnit, Arrays.copyOfRange(readBases, 0, offset + 1), false);
                maxRL = maxFW + maxBW;
                bestRepeatUnit = bestFWRepeatUnit;

            }

        }



        if(maxRL > MAX_REPEAT_LENGTH) { maxRL = MAX_REPEAT_LENGTH; }
        return new Pair<byte[], Integer>(bestRepeatUnit, maxRL);

    }
    @Override
    public final Object getValue(final String str) {
        return str;
    }

    @Override
    public synchronized String formatKey(final int key) {
        // This method is synchronized so that we don't attempt to do a get()
        // from the reverse lookup table while that table is being updated
        return repeatReverseLookupTable.get(key);
    }

    @Requires({"repeatLength>=0", "repeatFromUnitAndLength != null"})
    @Ensures("result != null")
    protected abstract String getCovariateValueFromUnitAndLength(final byte[] repeatFromUnitAndLength, final int repeatLength);


    @Override
    public int keyFromValue(final Object value) {
        return keyForRepeat((String) value);
    }

    /**
     * Get the mapping from read group names to integer key values for all read groups in this covariate
     * @return a set of mappings from read group names -> integer key values
     */
    public Set<Map.Entry<String, Integer>> getKeyMap() {
        return repeatLookupTable.entrySet();
    }

    private int keyForRepeat(final String repeatID) {
        // Rather than synchronize this entire method (which would be VERY expensive for walkers like the BQSR),
        // synchronize only the table updates.

        // Before entering the synchronized block, check to see if this read group is not in our tables.
        // If it's not, either we will have to insert it, OR another thread will insert it first.
        // This preliminary check avoids doing any synchronization most of the time.
        if ( ! repeatLookupTable.containsKey(repeatID) ) {

            synchronized ( this ) {

                // Now we need to make sure the key is STILL not there, since another thread may have come along
                // and inserted it while we were waiting to enter this synchronized block!
                if ( ! repeatLookupTable.containsKey(repeatID) ) {
                    repeatLookupTable.put(repeatID, nextId);
                    repeatReverseLookupTable.put(nextId, repeatID);
                    nextId++;
                }
            }
        }

        return repeatLookupTable.get(repeatID);
    }


    /**
     * Splits repeat unit and num repetitions from covariate value.
     * For example, if value if "ATG4" it returns (ATG,4)
     * @param value             Covariate value
     * @return                  Split pair
     */
    @Requires("value != null")
    @Ensures({"result.first != null","result.second>=0"})
    public static Pair<String,Integer> getRUandNRfromCovariate(final String value) {

        int k = 0;
        for ( k=0; k < value.length(); k++ ) {
            if (!BaseUtils.isRegularBase(value.getBytes()[k]))
                break;
        }
        Integer nr = Integer.valueOf(value.substring(k,value.length())); // will throw NumberFormatException if format illegal
        if (k == value.length() || nr <= 0)
            throw new IllegalStateException("Covariate is not of form (Repeat Unit) + Integer");

        return new Pair<String,Integer>(value.substring(0,k), nr);
    }

    /**
     * Gets bases from tandem repeat representation (Repeat Unit),(Number of Repeats).
     * For example, (AGC),3 returns AGCAGCAGC
     * @param repeatUnit    Tandem repeat unit
     * @param numRepeats    Number of repeats
     * @return              Expanded String
     */
    @Requires({"numRepeats > 0","repeatUnit != null"})
    @Ensures("result != null")
    public static String getBasesFromRUandNR(final String repeatUnit, final int numRepeats) {
        final StringBuilder sb = new StringBuilder();

        for (int i=0; i < numRepeats; i++)
            sb.append(repeatUnit);

        return sb.toString();
    }

    // version given covariate key
    public static String  getBasesFromRUandNR(final String covariateValue) {
        Pair<String,Integer> pair = getRUandNRfromCovariate(covariateValue);
        return getBasesFromRUandNR(pair.getFirst(), pair.getSecond());
    }

    @Override
    public abstract int maximumKeyValue();



}
