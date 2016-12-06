package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationCodeFAOTERMIterator theGeographicLocation = (GeographicLocationCodeFAOTERMIterator)findAncestorWithClass(this, GeographicLocationCodeFAOTERMIterator.class);
			pageContext.getOut().print(theGeographicLocation.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

