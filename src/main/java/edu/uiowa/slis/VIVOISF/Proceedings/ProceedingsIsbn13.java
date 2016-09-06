package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsIsbn13Iterator theProceedings = (ProceedingsIsbn13Iterator)findAncestorWithClass(this, ProceedingsIsbn13Iterator.class);
			pageContext.getOut().print(theProceedings.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

