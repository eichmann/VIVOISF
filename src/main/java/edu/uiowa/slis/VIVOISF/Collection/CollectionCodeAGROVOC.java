package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCodeAGROVOCIterator theCollection = (CollectionCodeAGROVOCIterator)findAncestorWithClass(this, CollectionCodeAGROVOCIterator.class);
			pageContext.getOut().print(theCollection.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

