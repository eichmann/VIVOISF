package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionRO_0001025Iterator theCollectionRO_0001025Iterator = (CollectionRO_0001025Iterator)findAncestorWithClass(this, CollectionRO_0001025Iterator.class);
			pageContext.getOut().print(theCollectionRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

