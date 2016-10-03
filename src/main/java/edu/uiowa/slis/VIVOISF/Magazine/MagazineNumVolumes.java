package edu.uiowa.slis.VIVOISF.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineNumVolumes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MagazineNumVolumes currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineNumVolumes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineNumVolumesIterator theMagazine = (MagazineNumVolumesIterator)findAncestorWithClass(this, MagazineNumVolumesIterator.class);
			pageContext.getOut().print(theMagazine.getNumVolumes());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for numVolumes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for numVolumes tag ");
		}
		return SKIP_BODY;
	}
}

