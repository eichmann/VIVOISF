package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionLandAreaTotalIterator thegeographical_region = (geographical_regionLandAreaTotalIterator)findAncestorWithClass(this, geographical_regionLandAreaTotalIterator.class);
			pageContext.getOut().print(thegeographical_region.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

