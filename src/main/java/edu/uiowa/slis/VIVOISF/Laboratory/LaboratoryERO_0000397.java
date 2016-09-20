package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryERO_0000397 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryERO_0000397 currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryERO_0000397.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryERO_0000397Iterator theLaboratoryERO_0000397Iterator = (LaboratoryERO_0000397Iterator)findAncestorWithClass(this, LaboratoryERO_0000397Iterator.class);
			pageContext.getOut().print(theLaboratoryERO_0000397Iterator.getERO_0000397());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for ERO_0000397 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for ERO_0000397 tag ");
		}
		return SKIP_BODY;
	}
}

