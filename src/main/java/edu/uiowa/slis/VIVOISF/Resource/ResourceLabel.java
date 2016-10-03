package edu.uiowa.slis.VIVOISF.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResourceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Resource theResource = (Resource)findAncestorWithClass(this, Resource.class);
			if (!theResource.commitNeeded) {
				pageContext.getOut().print(theResource.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Resource theResource = (Resource)findAncestorWithClass(this, Resource.class);
			return theResource.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Resource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Resource theResource = (Resource)findAncestorWithClass(this, Resource.class);
			theResource.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for label tag ");
		}
	}
}

