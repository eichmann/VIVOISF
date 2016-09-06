package edu.uiowa.slis.VIVOISF.DbXref;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DbXrefInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DbXrefInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(DbXrefInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DbXrefInformationResourceSupportedByIterator theDbXrefInformationResourceSupportedByIterator = (DbXrefInformationResourceSupportedByIterator)findAncestorWithClass(this, DbXrefInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theDbXrefInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing DbXref for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing DbXref for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

