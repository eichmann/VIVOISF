package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameShortITIterator theCollection = (CollectionNameShortITIterator)findAncestorWithClass(this, CollectionNameShortITIterator.class);
			pageContext.getOut().print(theCollection.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

