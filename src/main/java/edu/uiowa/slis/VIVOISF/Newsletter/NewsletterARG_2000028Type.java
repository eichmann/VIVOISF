package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterARG_2000028Iterator theNewsletterARG_2000028Iterator = (NewsletterARG_2000028Iterator)findAncestorWithClass(this, NewsletterARG_2000028Iterator.class);
			pageContext.getOut().print(theNewsletterARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

