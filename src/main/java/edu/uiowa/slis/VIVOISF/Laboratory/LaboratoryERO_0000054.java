package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryERO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryERO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryERO_0000054.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LaboratoryERO_0000054Iterator theLaboratory = (LaboratoryERO_0000054Iterator)findAncestorWithClass(this, LaboratoryERO_0000054Iterator.class);
			pageContext.getOut().print(theLaboratory.getERO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for ERO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for ERO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

