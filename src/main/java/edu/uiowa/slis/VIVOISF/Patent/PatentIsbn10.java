package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentIsbn10Iterator thePatent = (PatentIsbn10Iterator)findAncestorWithClass(this, PatentIsbn10Iterator.class);
			pageContext.getOut().print(thePatent.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

