package edu.uiowa.slis.VIVOISF.Telephone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TelephoneRelatedByIterator theTelephoneRelatedByIterator = (TelephoneRelatedByIterator)findAncestorWithClass(this, TelephoneRelatedByIterator.class);
			pageContext.getOut().print(theTelephoneRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Telephone for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Telephone for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

