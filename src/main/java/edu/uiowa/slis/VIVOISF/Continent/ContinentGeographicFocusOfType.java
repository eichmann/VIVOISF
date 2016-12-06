package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentGeographicFocusOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentGeographicFocusOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentGeographicFocusOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentGeographicFocusOfIterator theContinentGeographicFocusOfIterator = (ContinentGeographicFocusOfIterator)findAncestorWithClass(this, ContinentGeographicFocusOfIterator.class);
			pageContext.getOut().print(theContinentGeographicFocusOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

