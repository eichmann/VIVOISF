package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperEanucc13Iterator theNewspaper = (NewspaperEanucc13Iterator)findAncestorWithClass(this, NewspaperEanucc13Iterator.class);
			pageContext.getOut().print(theNewspaper.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

