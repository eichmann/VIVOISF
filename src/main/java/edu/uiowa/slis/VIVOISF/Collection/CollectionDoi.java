package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionDoiIterator theCollection = (CollectionDoiIterator)findAncestorWithClass(this, CollectionDoiIterator.class);
			pageContext.getOut().print(theCollection.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for doi tag ");
		}
		return SKIP_BODY;
	}
}

