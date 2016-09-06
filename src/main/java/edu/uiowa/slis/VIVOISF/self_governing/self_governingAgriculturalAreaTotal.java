package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingAgriculturalAreaTotalIterator theself_governing = (self_governingAgriculturalAreaTotalIterator)findAncestorWithClass(this, self_governingAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theself_governing.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

