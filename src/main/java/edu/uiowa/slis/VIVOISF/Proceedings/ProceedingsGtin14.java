package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsGtin14Iterator theProceedings = (ProceedingsGtin14Iterator)findAncestorWithClass(this, ProceedingsGtin14Iterator.class);
			pageContext.getOut().print(theProceedings.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

