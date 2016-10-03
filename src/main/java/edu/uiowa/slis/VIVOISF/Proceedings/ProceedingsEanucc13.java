package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsEanucc13Iterator theProceedings = (ProceedingsEanucc13Iterator)findAncestorWithClass(this, ProceedingsEanucc13Iterator.class);
			pageContext.getOut().print(theProceedings.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

