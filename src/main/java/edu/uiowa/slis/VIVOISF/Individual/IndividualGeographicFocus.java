package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndividualGeographicFocusIterator theIndividualGeographicFocusIterator = (IndividualGeographicFocusIterator)findAncestorWithClass(this, IndividualGeographicFocusIterator.class);
			pageContext.getOut().print(theIndividualGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

