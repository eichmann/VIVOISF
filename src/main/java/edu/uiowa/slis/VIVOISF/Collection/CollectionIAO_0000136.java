package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionIAO_0000136Iterator theCollectionIAO_0000136Iterator = (CollectionIAO_0000136Iterator)findAncestorWithClass(this, CollectionIAO_0000136Iterator.class);
			pageContext.getOut().print(theCollectionIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

