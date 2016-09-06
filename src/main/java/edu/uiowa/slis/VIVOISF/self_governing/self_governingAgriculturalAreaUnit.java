package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingAgriculturalAreaUnitIterator theself_governing = (self_governingAgriculturalAreaUnitIterator)findAncestorWithClass(this, self_governingAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theself_governing.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

