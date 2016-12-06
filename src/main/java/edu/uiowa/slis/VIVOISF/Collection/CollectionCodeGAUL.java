package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCodeGAULIterator theCollection = (CollectionCodeGAULIterator)findAncestorWithClass(this, CollectionCodeGAULIterator.class);
			pageContext.getOut().print(theCollection.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

