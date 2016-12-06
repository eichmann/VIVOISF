package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379AgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379AgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379AgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379AgriculturalAreaTotalIterator theARG_2000379 = (ARG_2000379AgriculturalAreaTotalIterator)findAncestorWithClass(this, ARG_2000379AgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theARG_2000379.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

