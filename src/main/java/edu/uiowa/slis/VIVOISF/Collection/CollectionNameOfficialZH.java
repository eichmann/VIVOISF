package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameOfficialZHIterator theCollection = (CollectionNameOfficialZHIterator)findAncestorWithClass(this, CollectionNameOfficialZHIterator.class);
			pageContext.getOut().print(theCollection.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

