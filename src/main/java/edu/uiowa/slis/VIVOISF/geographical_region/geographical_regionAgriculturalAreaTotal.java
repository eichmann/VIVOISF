package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionAgriculturalAreaTotalIterator thegeographical_region = (geographical_regionAgriculturalAreaTotalIterator)findAncestorWithClass(this, geographical_regionAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(thegeographical_region.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

