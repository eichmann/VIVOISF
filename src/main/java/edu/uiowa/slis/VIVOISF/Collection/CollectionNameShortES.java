package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameShortESIterator theCollection = (CollectionNameShortESIterator)findAncestorWithClass(this, CollectionNameShortESIterator.class);
			pageContext.getOut().print(theCollection.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

