package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsERO_0000045Iterator theProceedings = (ProceedingsERO_0000045Iterator)findAncestorWithClass(this, ProceedingsERO_0000045Iterator.class);
			pageContext.getOut().print(theProceedings.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

