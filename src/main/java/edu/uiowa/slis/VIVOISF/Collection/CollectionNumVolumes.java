package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionNumVolumes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionNumVolumes currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionNumVolumes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionNumVolumesIterator theCollection = (CollectionNumVolumesIterator)findAncestorWithClass(this, CollectionNumVolumesIterator.class);
			pageContext.getOut().print(theCollection.getNumVolumes());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for numVolumes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for numVolumes tag ");
		}
		return SKIP_BODY;
	}
}

