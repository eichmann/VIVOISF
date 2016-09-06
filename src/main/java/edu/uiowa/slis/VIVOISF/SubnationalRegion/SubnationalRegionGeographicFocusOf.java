package edu.uiowa.slis.VIVOISF.SubnationalRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SubnationalRegionGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SubnationalRegionGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SubnationalRegionGeographicFocusOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SubnationalRegionGeographicFocusOfIterator theSubnationalRegionGeographicFocusOfIterator = (SubnationalRegionGeographicFocusOfIterator)findAncestorWithClass(this, SubnationalRegionGeographicFocusOfIterator.class);
			pageContext.getOut().print(theSubnationalRegionGeographicFocusOfIterator.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing SubnationalRegion for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubnationalRegion for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

