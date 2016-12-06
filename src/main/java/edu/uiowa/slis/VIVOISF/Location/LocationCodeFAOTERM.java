package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationCodeFAOTERMIterator theLocation = (LocationCodeFAOTERMIterator)findAncestorWithClass(this, LocationCodeFAOTERMIterator.class);
			pageContext.getOut().print(theLocation.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

