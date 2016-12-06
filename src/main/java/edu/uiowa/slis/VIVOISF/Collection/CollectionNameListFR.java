package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameListFRIterator theCollection = (CollectionNameListFRIterator)findAncestorWithClass(this, CollectionNameListFRIterator.class);
			pageContext.getOut().print(theCollection.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

