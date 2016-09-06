package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsARG_0000001Iterator theProceedings = (ProceedingsARG_0000001Iterator)findAncestorWithClass(this, ProceedingsARG_0000001Iterator.class);
			pageContext.getOut().print(theProceedings.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

