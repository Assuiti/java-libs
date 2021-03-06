/*
 * component:   "openEHR Java Reference Implementation"
 * description: "Java ADL Parser"
 * keywords:    "binding"
 *
 * author:      "Rong Chen <rong.acode@gmail.com>"
 * copyright:   "Copyright (C) 2005,2006,2007 ACODE HB, Sweden"
 * copyright:   "Copyright (C) 2008,2009 Cambio Healthcare Systems, Sweden"
 * license:     "See notice at bottom of class"
 *
 * file:        "$URL$"
 * revision:    "$LastChangedRevision$"
 * last_change: "$LastChangedDate$"
 */

package se.acode.openehr.parser;

import java.util.List;

/**
 * IdentifiedObject
 *
 * @author Rong Chen
 * @version 1.0
 */
public class ContentObject extends Parsed {

    /* fields */
    String id;              // null for anonymous object
    String constraint;      // null for anonymous object
    List attributes;
}
