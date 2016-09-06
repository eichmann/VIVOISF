package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsIAO_0000136Iterator theProceedingsIAO_0000136Iterator = (ProceedingsIAO_0000136Iterator)findAncestorWithClass(this, ProceedingsIAO_0000136Iterator.class);
			pageContext.getOut().print(theProceedingsIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

