package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookNumVolumes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookNumVolumes currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookNumVolumes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookNumVolumesIterator theMultiVolumeBook = (MultiVolumeBookNumVolumesIterator)findAncestorWithClass(this, MultiVolumeBookNumVolumesIterator.class);
			pageContext.getOut().print(theMultiVolumeBook.getNumVolumes());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for numVolumes tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for numVolumes tag ");
		}
		return SKIP_BODY;
	}
}

