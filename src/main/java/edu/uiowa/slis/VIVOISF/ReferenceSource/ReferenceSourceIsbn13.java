package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceIsbn13Iterator theReferenceSource = (ReferenceSourceIsbn13Iterator)findAncestorWithClass(this, ReferenceSourceIsbn13Iterator.class);
			pageContext.getOut().print(theReferenceSource.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

