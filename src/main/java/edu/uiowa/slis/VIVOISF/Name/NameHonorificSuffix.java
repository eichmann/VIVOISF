package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameHonorificSuffix extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameHonorificSuffix currentInstance = null;
	private static final Log log = LogFactory.getLog(NameHonorificSuffix.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NameHonorificSuffixIterator theName = (NameHonorificSuffixIterator)findAncestorWithClass(this, NameHonorificSuffixIterator.class);
			pageContext.getOut().print(theName.getHonorificSuffix());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for honorificSuffix tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for honorificSuffix tag ");
		}
		return SKIP_BODY;
	}
}

