package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCodeUNIterator theCollection = (CollectionCodeUNIterator)findAncestorWithClass(this, CollectionCodeUNIterator.class);
			pageContext.getOut().print(theCollection.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

