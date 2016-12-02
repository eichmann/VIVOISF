package edu.uiowa.slis.VIVOISF.County;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountyGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountyGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CountyGeographicFocusOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountyGeographicFocusOfIterator theCounty = (CountyGeographicFocusOfIterator)findAncestorWithClass(this, CountyGeographicFocusOfIterator.class);
			pageContext.getOut().print(theCounty.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing County for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing County for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

