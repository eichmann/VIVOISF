package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameHonorificPrefix extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameHonorificPrefix currentInstance = null;
	private static final Log log = LogFactory.getLog(NameHonorificPrefix.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NameHonorificPrefixIterator theName = (NameHonorificPrefixIterator)findAncestorWithClass(this, NameHonorificPrefixIterator.class);
			pageContext.getOut().print(theName.getHonorificPrefix());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for honorificPrefix tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for honorificPrefix tag ");
		}
		return SKIP_BODY;
	}
}

