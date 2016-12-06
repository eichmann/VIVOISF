package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(KindAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindAgriculturalAreaUnitIterator theKind = (KindAgriculturalAreaUnitIterator)findAncestorWithClass(this, KindAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theKind.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

