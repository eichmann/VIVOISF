package edu.uiowa.slis.VIVOISF.County;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountyGeographicFocusOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountyGeographicFocusOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountyGeographicFocusOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountyGeographicFocusOfIterator theCountyGeographicFocusOfIterator = (CountyGeographicFocusOfIterator)findAncestorWithClass(this, CountyGeographicFocusOfIterator.class);
			pageContext.getOut().print(theCountyGeographicFocusOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing County for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing County for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

