package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272AuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272AuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272AuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272AuthorListIterator theOBI_0000272AuthorListIterator = (OBI_0000272AuthorListIterator)findAncestorWithClass(this, OBI_0000272AuthorListIterator.class);
			pageContext.getOut().print(theOBI_0000272AuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for authorList tag ");
		}
		return SKIP_BODY;
	}
}
