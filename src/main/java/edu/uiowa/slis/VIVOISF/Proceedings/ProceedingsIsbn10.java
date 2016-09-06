package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsIsbn10Iterator theProceedings = (ProceedingsIsbn10Iterator)findAncestorWithClass(this, ProceedingsIsbn10Iterator.class);
			pageContext.getOut().print(theProceedings.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

