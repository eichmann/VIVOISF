package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceIsbn10Iterator theReferenceSource = (ReferenceSourceIsbn10Iterator)findAncestorWithClass(this, ReferenceSourceIsbn10Iterator.class);
			pageContext.getOut().print(theReferenceSource.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

