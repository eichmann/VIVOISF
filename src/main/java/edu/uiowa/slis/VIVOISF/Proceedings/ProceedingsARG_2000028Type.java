package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsARG_2000028Iterator theProceedingsARG_2000028Iterator = (ProceedingsARG_2000028Iterator)findAncestorWithClass(this, ProceedingsARG_2000028Iterator.class);
			pageContext.getOut().print(theProceedingsARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

