package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentIsbn13Iterator thePatent = (PatentIsbn13Iterator)findAncestorWithClass(this, PatentIsbn13Iterator.class);
			pageContext.getOut().print(thePatent.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

