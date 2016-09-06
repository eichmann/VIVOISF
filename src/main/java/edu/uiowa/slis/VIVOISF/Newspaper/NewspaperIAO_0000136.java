package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperIAO_0000136Iterator theNewspaperIAO_0000136Iterator = (NewspaperIAO_0000136Iterator)findAncestorWithClass(this, NewspaperIAO_0000136Iterator.class);
			pageContext.getOut().print(theNewspaperIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

