package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameOfficialESIterator theCollection = (CollectionNameOfficialESIterator)findAncestorWithClass(this, CollectionNameOfficialESIterator.class);
			pageContext.getOut().print(theCollection.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

