package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManuscriptVolumeIterator theManuscript = (ManuscriptVolumeIterator)findAncestorWithClass(this, ManuscriptVolumeIterator.class);
			pageContext.getOut().print(theManuscript.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for volume tag ");
		}
		return SKIP_BODY;
	}
}

