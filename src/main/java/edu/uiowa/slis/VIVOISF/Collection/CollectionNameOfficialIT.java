package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNameOfficialITIterator theCollection = (CollectionNameOfficialITIterator)findAncestorWithClass(this, CollectionNameOfficialITIterator.class);
			pageContext.getOut().print(theCollection.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

